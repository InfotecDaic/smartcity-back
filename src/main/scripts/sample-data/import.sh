#!/bin/bash

HOST=localhost
PORT=27017
DATABASE=smartcity

function loadFile() {
    if [ -f $2 ]; then
        echo "Import $2 file on $1 collection"
        mongoimport --host $HOST --port $PORT --db $DATABASE --collection $1 --drop --file $2
    else
        echo "File $2 not found"
    fi
}

loadFile 'country' 'country_file.json'
loadFile 'region' 'region_file.json'
loadFile 'locality' 'locality_file.json'
