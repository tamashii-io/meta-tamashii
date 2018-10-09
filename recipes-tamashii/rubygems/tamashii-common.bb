# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e3fc50a88d0a364313df4b21ef20c29e"

PR = "r0"

BPV = "0.2.0"
PV = "${BPV}"
SRCREV = "b97b37ac3f05201d79633fcc8e523259231c12fa"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/tamashii-common.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
