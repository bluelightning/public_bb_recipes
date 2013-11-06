SUMMARY = "Sub::Uplevel - apparently run a function in a higher stack frame"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=240dcddb52ac3d2c14ac4fa2795d9249"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Sub-Uplevel-${PV}.tar.gz"
SRC_URI[md5sum] = "bea4037e8b2a0df563e25e6e44cb2e73"
SRC_URI[sha256sum] = "0f93f6e9c80b8dcb22c60d0e9df2c2c6d7db10d4d37151f1dfea6e54a3c6fdfb"

S = "${WORKDIR}/Sub-Uplevel-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-exporter \
                   perl-module-strict \
                   perl-module-warnings \
                   perl-module-carp \
                   "

BBCLASSEXTEND = "native"
