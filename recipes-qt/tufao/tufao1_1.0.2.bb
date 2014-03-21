DESCRIPTION = "Tufao webserver"
HOMEPAGE = "http://vinipsmaker.github.io/tufao/"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

SRC_URI = "git://github.com/vinipsmaker/tufao;branch=master \
           file://hardcode_paths.patch \
           file://qt_sysroot.patch "
S= "${WORKDIR}/git"
SRCREV = "0d37027f8e7a64bc58196b963dffc72e13420c7a"

FILES_${PN}-dev += "${datadir}/cmake-* ${libdir}/qt5/mkspecs/features/*"
