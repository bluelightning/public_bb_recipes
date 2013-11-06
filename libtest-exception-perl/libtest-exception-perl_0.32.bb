SUMMARY = "Test::Exception - Test exception based code"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://README;md5=64db295789c2e958f0d68ea5e5ea0c9b"

DEPENDS += "libsub-uplevel-perl-native"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADIE/Test-Exception-${PV}.tar.gz"
SRC_URI[md5sum] = "50e985a335842540b69ea886eeed8a7f"
SRC_URI[sha256sum] = "ba4427e6004797ece8dce93c61d1d6c82df891b0f017e7d4a5c2505fa05c5a47"

S = "${WORKDIR}/Test-Exception-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-base \
                   perl-module-carp \
                   perl-module-strict \
                   libsub-uplevel-perl \
                   perl-module-test-builder \
                   perl-module-warnings \
                   libtest-more-perl \
                   libtest-simple-perl \
                   libtest-harness-perl \
                   libtest-builder-perl \
                   libtest-builder-tester-perl \
                   "

BBCLASSEXTEND = "native"
