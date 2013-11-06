SUMMARY = "This package contains the Parser.pm module with friends."
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/release/HTML-Parser"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=6c3dacf9f405c7483870ab5f148770c3"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTML-Parser-${PV}.tar.gz"
SRC_URI[md5sum] = "9128a45893097dfa3bf03301b19c5efe"
SRC_URI[sha256sum] = "be918b3749d3ff93627f72ee4b825683332ecb4c81c67a3a8d72b0435ffbd802"

S = "${WORKDIR}/HTML-Parser-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

RDEPENDS_${PN} += "libhtml-tagset-perl \
                   libxsloader-perl \
                   "

RPROVIDES_${PN} += "libhtml-entities-perl \
                    libhtml-filter-perl \
                    libhtml-headparser-perl \
                    libhtml-linkextor-perl \
                    libhtml-parser-perl \
                    libhtml-pullparser-perl \
                    libhtml-tokeparser-perl \
                    "

BBCLASSEXTEND = "native"
