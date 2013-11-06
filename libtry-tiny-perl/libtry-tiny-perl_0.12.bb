SUMMARY = "Try::Tiny - minimal try/catch with proper localization of $@"
AUTHOR = "Jesse Luehrs <doy@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Try::Tiny"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=2bf53c2ff33ef4845e29419b59e8abfc"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Try-Tiny-${PV}.tar.gz"
SRC_URI[md5sum] = "5b584cb5ace0a2f39d8949bacc800003"
SRC_URI[sha256sum] = "4f5c13c28909d9717bd79acc6b37d2a8f2d746f99abbacd7e03d2c3906179b2b"

S = "${WORKDIR}/Try-Tiny-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-strict \
                   perl-module-warnings \
                   perl-module-carp \
                   "

BBCLASSEXTEND = "native"
