#! /bin/bash -e

cd ./

docker-compose -f docker-compose-config.yaml up
docker-compose -f docker-compose-discovery.yaml up
