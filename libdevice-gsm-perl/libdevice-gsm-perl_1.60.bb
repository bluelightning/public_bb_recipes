SUMMARY = "Device::Gsm - Perl extension to interface GSM phones / modems"
AUTHOR = "Cosimo Streppone <cosimo@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Device::Gsm"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=3f0b149e4ed2b3520632c786f3d1ba9a"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CO/COSIMO/Device-Gsm-1.60.tar.gz"
SRC_URI[md5sum] = "1a1fa45a9b5415f1149610a06b7ce9c9"
SRC_URI[sha256sum] = "9739904d0022d6cf65f27b0ef91dbe4ce7c1cd7ef06dbb2c3e3b09639d8fc0ed"

S = "${WORKDIR}/Device-Gsm-${PV}"

inherit cpan

RDEPENDS_${PN} += "libdevice-modem-perl \
                   perl-module-time-hires \
                   libdevice-serialport-perl \
                   libtest-more-perl \
                   "

RPROVIDES_${PN} += "libdevice-gsm-pdu \
                    libdevice-gsm-sms \
                    libdevice-gsm-charset \
                    libdevice-gsm-networks \
                    libsms-token-perl \
                    libsms-token-da \
                    libsms-token-dcs \
                    libsms-token-dt \
                    libsms-token-mr \
                    libsms-token-oa \
                    libsms-token-pdutype \
                    libsms-token-pid \
                    libsms-token-sca \
                    libsms-token-scts \
                    libsms-token-st \
                    libsms-token-ud \
                    libsms-token-udh \
                    libsms-token-vp \
                    "

BBCLASSEXTEND = "native"
