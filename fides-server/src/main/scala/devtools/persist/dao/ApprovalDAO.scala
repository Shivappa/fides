package devtools.persist.dao

import devtools.domain.Approval
import devtools.persist.dao.definition.{AutoIncrementing, ByOrganizationDAO, DAO}
import devtools.persist.db.Tables.{ApprovalQuery, approvalQuery}
import slick.jdbc.GetResult
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.ExecutionContext

class ApprovalDAO(val db: Database)(implicit val executionContext: ExecutionContext)
  extends DAO[Approval, Long, ApprovalQuery](approvalQuery) with ByOrganizationDAO[Approval, ApprovalQuery]
  with AutoIncrementing[Approval, ApprovalQuery] {
  implicit def getResult: GetResult[Approval] =
    r =>
      Approval.fromInsertable(
        r.<<[Long],
        r.<<[Long],
        r.<<?[Long],
        r.<<?[Long],
        r.<<[Long],
        r.<<?[Long],
        r.<<?[String],
        r.<<?[String],
        r.<<[String],
        r.<<[String],
        r.<<?[String],
        r.<<?[java.sql.Timestamp]
      )

  def searchInOrganizationAction[C <: Rep[_]](value: String): ApprovalQuery => Rep[Option[Boolean]] = {
    t: ApprovalQuery =>
      (t.status like value) || (t.details like value) || (t.submitMessage like value) || (t.submitTag like value)
  }

}
