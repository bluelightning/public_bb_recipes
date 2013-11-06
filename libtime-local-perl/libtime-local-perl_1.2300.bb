SUMMARY = "Time::Local - efficiently compute time from local and GMT time"
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/module/Time::Local"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f4e05a25acd9fdcf66b1a99afbf0adf"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Time-Local-${PV}.tar.gz"
SRC_URI[md5sum] = "68e1be54c151cf131f9d4168b3e662f9"
SRC_URI[sha256sum] = "b2acca03700a09f8ae737d3084f3f6287e983da9ab7b537c6599c291b669fb49"

RDEPENDS_${PN} += "perl-module-strict \
                   perl-module-vars \
                   perl-module-carp \
                   perl-module-exporter \
                   libconstant-perl \
                   "

S = "${WORKDIR}/Time-Local-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
