# Running Fidesctl Locally (Standalone)

This method of running fidesctl requires zero dependencies outside of Python and a default pip installation of fidesctl. It is intended as the fastest possible quick start and is not designed for production-grade deployments.

To run in standalone mode, use one of the following methods:

```sh title="CLI flag"
fidesctl --local <subcommand>
```

```toml title="fidesctl.toml"
[cli]
local_mode = true
```

For more information on running a full fidesctl installation, see the [Running Fidesctl Locally (Full Installation)](local_full.md) or [Running Fidesctl in Docker](docker.md) pages.

## System Requirements

See the Python section of the [Prerequisites and Dependencies](../installation/prerequisites_dependencies.md) page for more information.

## Fidesctl Installation

The next step is to install fidesctl via [`pipx`](https://pypa.github.io/pipx/):

```sh
pipx install fidesctl
```

For more information on pipx, installing fidesctl, and other potential extras, see the [Installation from PyPI](../installation/pypi.md) guide.

## Verifying the Installation

Now that we have fidesctl installed, let's verify the installation:

```sh title="Command"
fidesctl --version
```

```txt title="Expected Output"
fidesctl, version 1.0.0
```

## Initializing Fidesctl

With Fidesctl installed, it's time to initialize fidesctl for a project, so we have some place to start adding resource manifests and tweaking our configuration.

Switch to your project's root directory, and initialize fidesctl:

```sh title="Initialize Fidesctl"
fidesctl init
```

```txt title="Expected Output"
Initializing Fidesctl...
----------
Created a './.fides' directory.
----------
Created a fidesctl config file: ./.fides/fidesctl.toml
To learn more about configuring fidesctl, see:
    https://ethyca.github.io/fides/installation/configuration/
----------
For example policies and help getting started, see:
    https://ethyca.github.io/fides/guides/policies/
----------
Fidesctl initialization complete.
```

That's it! Your local standalone installation of fidesctl is up and running.

## Next Steps

See the [Tutorial](../tutorial/index.md) page for a step-by-step guide on setting up a Fides data privacy workflow.
