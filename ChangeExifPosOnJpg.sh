#!/bin/bash

#javac gpsPosGen/AltMain.java gpsPosGen/X.java 
#javac gpsPosGen/LatMain.java gpsPosGen/X.java
#javac gpsPosGen/LongMain.java gpsPosGen/X.java

for filename in PicsToUppload/*.jpg;
do
    cd gpsPosGen/
    lat=`java LatMain`
    long=`java LongMain`
    alt=`java AltMain`
    #quote='"'
    cd
    lat="${lat:7}"
    long="${long:7}"
    alt="${alt:6}"
    echo "$lat"
    echo "$long"
    echo "$alt"
    exiftool -overwrite_original -GPSAltitude="$alt" -GPSLatitude="$lat" -GPSLongitude="$long" $filename
    #echo $filename
    xterm -hold -e exiftool $filename
done
		    
