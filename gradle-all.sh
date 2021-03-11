#! /bin/bash -e

for dir in *-service ; do
	(cd $dir ; ./gradlew clean assemble $*)
done
