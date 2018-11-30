SUMMARY = "Library which allows userspace application access to NFC devices."
HOMEPAGE = "http://nfc-tools.org/index.php?title=Libnfc"
SECTION = "libs"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b52f2d57d10c4f7ee67a7eb9615d5d24"

DEPENDS = "libusb-compat"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "2d4543673e9b76c02679ca8b89259659f1afd932"
SRC_URI = "git://github.com/nfc-tools/libnfc.git"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

BBCLASSEXTEND = "native nativesdk"
