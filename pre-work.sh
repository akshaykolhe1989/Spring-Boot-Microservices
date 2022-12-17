#! /bin/bash -e

cd ./

docker-compose -f docker-compose-config.yaml up -d
sleep 2m
docker-compose -f docker-compose-discovery.yaml up
