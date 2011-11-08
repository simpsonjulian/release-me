#!/usr/bin/env bash
set -e # let's *not* keep on trucking
rm -f *.releaseBackup
rm -f release.properties

mvn --batch-mode -Dtag=my-proj-1.3 release:prepare \
                 -DreleaseVersion=1.3 \
                 -DdevelopmentVersion=1.4-SNAPSHOT
mvn --batch-mode release:perform
