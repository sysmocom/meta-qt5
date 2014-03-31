DESCRIPTION = "Qt Wrapper for systemd"
HOMEPAGE = "https://github.com/ilpianista/libsystemd-qt"

LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit cmake_qt5

DEPENDS += "systemd qtbase"
RDEPENDS_${PN} = "dbus"

PV = "208+git${SRCPV}"

SRC_URI = "git://github.com/ilpianista/libsystemd-qt;branch=master \
           file://fix-pkgconfig.patch \
           file://0001-Add-wrapper-for-the-resetFailedUnit-command.patch "
S= "${WORKDIR}/git"
SRCREV = "398056b33314fc583dd8d8422e5c2f8b797fdb3b"

FILES_${PN}-dev += "${libdir}/cmake/* ${libdir}/qt5/mkspecs/features/*"
