#!/usr/bin/env bash
set -e # let's *not* keep on trucking

mvn --batch-mode -Dtag=my-proj-1.3 release:prepare \
                 -DreleaseVersion=1.3 \
                 -DdevelopmentVersion=2.0-SNAPSHOT
mvn --batch-mode release:perform
