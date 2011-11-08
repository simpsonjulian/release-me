#!/usr/bin/env bash
set -e # let's *not* keep on trucking
rm -f *.releaseBackup
rm -f release.properties

mvn --batch-mode -Dtag=my-proj-1.5 release:prepare \
                 -DreleaseVersion=1.5 \
                 -DdevelopmentVersion=1.6-SNAPSHOT
mvn --batch-mode release:perform
