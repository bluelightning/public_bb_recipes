SUMMARY = "A module for deferred execution, to schedule things that await execution"
AUTHOR = "Paul Evans <leonerd@leonerd.org.uk>"
HOMEPAGE = "https://metacpan.org/release/Future"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1110802953dcda019191a6124f13a28b"

RPROVIDES_${PN} = " \
                  libfuture-perl \
                  libfuture-utils-perl \
                  "

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Future-${PV}.tar.gz"
SRC_URI[md5sum] = "424aa5bf6472bf4e3ab01a20c92763c6"
SRC_URI[sha256sum] = "1cf70b690faa623ad854ec8ec32ef07dc187a57061ac95ca4679f04f1216e84e"

S = "${WORKDIR}/Future-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
