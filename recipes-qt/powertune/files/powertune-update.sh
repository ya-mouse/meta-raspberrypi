#!/bin/sh

if [ -d /home/pi/build ];then
  rm -r /opt/PowerTune
  mkdir /opt/PowerTune
  chown pi:pi /opt/PowerTune
  rsync -r /home/pi/build/. /opt/PowerTune
  rm -r /home/pi/build
fi
