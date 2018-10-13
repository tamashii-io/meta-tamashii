# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPL2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=270149a18e664d261350cfe727055898"

PR = "r0"

BPV = "1.0.9"
PV = "${BPV}"

S = "${WORKDIR}/eventmachine-1.0.9"

SRC_URI = " \
    https://github.com/eventmachine/eventmachine/archive/v1.0.9.tar.gz \
    "

inherit rubygems

BBCLASSEXTEND = "native"
