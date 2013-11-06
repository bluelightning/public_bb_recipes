SUMMARY = "DateTime::TimeZone - Time zone object base class and factory"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5073eed24d8ac152c95cd6be7c78a3c7"
HOMEPAGE = "http://datetime.perl.org/"
DEPENDS = "libclass-singleton-perl-native libparams-validate-perl-native"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-TimeZone-${PV}.tar.gz"
SRC_URI[md5sum] = "1f1cec90df196f34bfd6814fd23a6ba4"
SRC_URI[sha256sum] = "2ae1b848f6ca6f3456089d07a1905be747776570d02309f1d7f6f122dbc08f28"

S = "${WORKDIR}/DateTime-TimeZone-${PV}"

inherit cpan

RDEPENDS_${PN} += "libclass-singleton-perl \
                   libclass-load-perl \
                   libconstant-perl \
                   libparams-validate-perl \
                   perl-module-test-more \
                   perl-module-cwd \
                   perl-module-file-basename \
                   perl-module-file-spec \
                   perl-module-file-compare \
                   perl-module-file-find \
                   perl-module-list-util \
                   perl-module-strict \
                   perl-module-vars \
                   perl-module-warnings \
                   perl-module-parent \
                   "

BBCLASSEXTEND = "native"


