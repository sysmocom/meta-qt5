require qt5-git.inc
require ${PN}.inc

# prepend this again, because ${PN}.inc prepneds ${PN}
FILESEXTRAPATHS =. "${FILE_DIRNAME}/${BPN}-git:"

SRC_URI = "\
    git://qt.gitorious.org/qt/${QT_MODULE}.git;branch=${QT_MODULE_BRANCH} \
"

# common with -native
SRC_URI += "\
    file://0001-Add-linux-oe-g-platform.patch \
    file://0002-Add-external-hostbindir-option.patch \
    file://0003-qlibraryinfo-allow-to-set-qt.conf-from-the-outside-u.patch \
    file://0004-configureapp-Prefix-default-LIBDIRS-and-INCDIRS-with.patch \
    file://0005-qt_module-Fix-pkgconfig-replacement.patch \
    file://0006-configure-make-pulseaudio-alsa-freetype-a-configurab.patch \
"

# common with native version
SRC_URI += " \
    file://0010-Always-build-uic.patch \
"    

# specific for nativesdk version
SRC_URI += " \
    file://0011-configure-preserve-built-qmake-and-swap-with-native-.patch \
    file://0012-configure-bump-path-length-from-256-to-512-character.patch \
"

SRCREV = "c6b555dac389f9a599a9ad342de56dea329fff60"
