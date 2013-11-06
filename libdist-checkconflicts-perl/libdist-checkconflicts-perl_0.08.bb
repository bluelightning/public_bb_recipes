SUMMARY = "Dist::CheckConflicts - declare version conflicts for your dist"
AUTHOR = "Jesse Luehrs <doy@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Dist::CheckConflicts"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ecaa4bbfd9cc21941119eb34f2937ff9"

RDEPENDS_${PN} = "perl-module-strict \
                 perl-module-warnings \
                 perl-module-carp \
                 liblist-moreutils-perl \
                 libmodule-runtime-perl \
                 "

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Dist-CheckConflicts-${PV}.tar.gz"
SRC_URI[md5sum] = "e6cf4dfe8c228e8cf814b52d49dd66e4"
SRC_URI[sha256sum] = "9526a144f31dbf3b59e788e6a647db89ce8b538bd0b4453997180a6004f892d2"

S = "${WORKDIR}/Dist-CheckConflicts-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
