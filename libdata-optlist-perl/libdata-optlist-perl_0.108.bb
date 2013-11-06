SUMMARY = "Data::OptList - parse and validate simple name/value option pairs"
AUTHOR = "Ricardo Signes <rjbs@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Data::OptList"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cc106d2d05c138ff9f18ccfd6e18b08"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Data-OptList-0.108.tar.gz"
SRC_URI[md5sum] = "f5c2d27987c1ec4b89b2702698881579"
SRC_URI[sha256sum] = "b4c7542803a644aff7c52abc50cdae1806cbc24fb7a8f98c38a518adaddaf28e"

S = "${WORKDIR}/Data-OptList-${PV}"

inherit cpan

RDEPENDS_${PN} += "libparams-util-perl \
                   libsub-install-perl \
                   perl-module-strict \
                   perl-module-warnings \
                   perl-module-list-util \
                   "

BBCLASSEXTEND = "native"
