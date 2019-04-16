#!/bin/bash

#if [ ! -d GPSPosPics/ ]; then
#  mkdir -p GPSPosPics/
#fi

#if [ ! -d GPSPosPics/GPSPosFiles/ ]; then
#  mkdir -p GPSPosPics/GPSPosFiles
#fi

for files in GPSPosPics/*.jpg;
do
    #echo ${files:11:15}
    #xterm -hold -e exiftool $files | GPS*
    cd GPSPosPics/
    exiftool -a ${files:11} | grep GPS* > ${files:11:15}.txt
    cd ..
done
