SUMMARY = "Device::Modem - Prel extension to talk to modem devices connected via serial port"
AUTHOR = "Cosimo Streppone <cosimo@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Device-Modem"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=b67c3a9c3a685020be4ae38a2ae1723c"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CO/COSIMO/Device-Modem-1.56.tar.gz"
SRC_URI[md5sum] = "a0ec45c3e313bea27ccb476d3b725955"
SRC_URI[sha256sum] = "907fc083b5dc11e0782a3a9482b0810108fd3b0f2bf09efdbdcced2a6cce6071"

S = "${WORKDIR}/Device-Modem-${PV}"

inherit cpan

RDEPENDS_${PN} += "libdevice-serialport-perl"

RPROVIDES_${PN} += "libdevice-modem-log-file-perl \
                    libdevice-modem-log-syslog-perl \
                    libdevice-modem-usrobotics-perl \
                    libdevice-xmodem-constants-perl \
                    libdevice-xmodem-block-perl \
                    libdevice-xmodem-buffer-perl \
                    libdevice-xmodem-receiver-perl \
                    "

BBCLASSEXTEND = "native"
