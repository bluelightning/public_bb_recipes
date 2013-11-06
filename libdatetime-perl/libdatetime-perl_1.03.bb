SUMMARY = "DateTime - A date and time object"
AUTHOR = "Dave Rolksy <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/release/DateTime"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44a502199a70b882f9372772b4b731a3"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-${PV}.tar.gz"
SRC_URI[md5sum] = "ea0fc830410b9ce3baeef3525bc0acdd"
SRC_URI[sha256sum] = "384f97c73da02492d771d6b5c3b37f6b18c2e12f4db3246b1d61ff19c6d6ad6d"

DEPENDS = "libtest-exception-perl-native \
           libdatetime-timezone-perl-native \
           libdatetime-locale-perl-native \
           "

S = "${WORKDIR}/DateTime-${PV}"

inherit cpan_build

RDEPENDS_${PN} += "libdatetime-timezone-perl \
                   libdatetime-locale-perl  \
                   perl-module-scalar-util \
                   perl-module-pod-man \
                   perl-module-time-local \
                   perl-module-integer \
                   perl-module-overload \
                   perl-module-strict \
                   perl-module-warnings \
                   perl-module-vars \
                   perl-module-carp \
                   perl-module-posix \
                   libparams-validate-perl \
                   libconstant-perl \
                   libtry-tiny-perl \
                   libxsloader-perl \
                   "

RPROVIDES_${PN} += "libdatetime-helpers-perl \
                    libdatetime-infinite-future-perl \
                    libdatetime-infinite-past-perl \
                    "

BBCLASSEXTEND = "native"

