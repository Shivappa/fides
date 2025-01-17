/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */

import type { PolicyRule } from './PolicyRule';

/**
 * The Policy resource model.
 *
 * An object used to organize a list of PolicyRules.
 */
export type Policy = {
  /**
   * A unique key used to identify this resource.
   */
  fides_key: string;
  /**
   * Defines the Organization that this resource belongs to.
   */
  organization_fides_key?: string;
  tags?: Array<string>;
  /**
   * Human-Readable name for this resource.
   */
  name?: string;
  /**
   * A detailed description of what this resource is.
   */
  description?: string;
  /**
   *
   * The PolicyRule resource model.
   *
   * Describes the allowed combination of the various privacy data types.
   *
   */
  rules: Array<PolicyRule>;
};
