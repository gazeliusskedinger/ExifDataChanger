#!/bin/sh

for filename in PicsToUppload/*.jpg;
do
    exiftool -overwrite_original -GPSAltitude="6000" -GPSLatitude="57 deg 22' 48.00"\"" N" -GPSLongitude="18 deg 14' 6.00"\"" E" $filename
    echo $filename
    #xterm -hold -e exiftool $filename
done
		    
