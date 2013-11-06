SUMMARY = "Net::GPSD3 - Interface to the gpsd server daemon protocol versions 3 (JSON)."
AUTHOR = "Michael R. Davis <mrdvt@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Net::GPSD3"
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a26e3dea20cfc9cedddba581090bfded"

RDEPENDS_${PN} += 'libdatetime-format-w3cdtf-perl perl-module-gps-point perl-module-io-socket-inet6 libjson-xs-perl perl-module-test-simple'

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MR/MRDVT/Net-GPSD3-${PV}.tar.gz"
SRC_URI[md5sum] = "c447b8bd633aa7408a181a391ccfb183"
SRC_URI[sha256sum] = "ae939037853d69678b4cfe6b4bd807ed317c9b34cdfb9f351de0723725ad0e2a"

S = "${WORKDIR}/Net-GPSD3-${PV}"

inherit cpan


BBCLASSEXTEND = "native"
