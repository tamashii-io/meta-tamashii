# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eacc720a1d62bc54d5684eedbc74fd85"

PR = "r0"

BPV = "1.0.0"
PV = "${BPV}"

S = "${WORKDIR}/logger-colors-${PV}"

SRC_URI = " \
    file://logger-colors-${PV}.tar.gz \
    "

inherit rubygems

BBCLASSEXTEND = "native"
