require qt5-git.inc
require ${PN}.inc

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

# target specific
SRC_URI += "\
    file://0007-qmake-don-t-build-it-in-configure-but-allow-to-build.patch \
    file://0008-eglfs-fix-egl-error-for-platforms-only-supporting-on.patch \
"

SRCREV = "c6b555dac389f9a599a9ad342de56dea329fff60"
