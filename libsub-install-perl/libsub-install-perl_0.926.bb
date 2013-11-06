SUMMARY = "Sub::Install - install subroutines into packages easily"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=28da7ee756be3a13c1cf94aaf219ba8d"

PR = "r5"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Sub-Install-${PV}.tar.gz"
SRC_URI[md5sum] = "89a7f82dd840bc2401f281b5f24732b9"
SRC_URI[sha256sum] = "acb2496643784976fe8edebc7b412e9a93f6f0825631f5bd9186c810aed1763e"

S = "${WORKDIR}/Sub-Install-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-carp \
                   perl-module-scalar-util \
                   perl-module-strict \
                   perl-module-warnings \
                   perl-module-test-more \
                   "

BBCLASSEXTEND = "native"
