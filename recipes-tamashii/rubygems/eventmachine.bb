# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPL2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=270149a18e664d261350cfe727055898"

PR = "r0"

BPV = "1.0.9"
PV = "${BPV}"

S = "${WORKDIR}/git"

# SRC_URI = " \
#     https://github.com/eventmachine/eventmachine/archive/v1.0.9.tar.gz \
#     file://eventmachine-1.0.9/eventmachine.gemspec \
#     "
# SRC_URI[md5sum] = "622454ac07357dc2c108371995c87fc7"

SRC_URI = " \
     git://github.com/eventmachine/eventmachine.git;branch=1.0-stable;tag=v${PV} \
     "

inherit rubygems

BBCLASSEXTEND = "native"

# do_configure[depends] += "openssl:do_populate_sysroot"
# do_configure[depends] += "openssl-native:do_populate_sysroot"

DEPENDS_${PN} += " \
    openssl \
"

# RDEPENDS_${PN} += " \
#     openssl \
# "
