SUMMARY = "Generates SQL from Perl data structures"
AUTHOR = "Peter Rabbitson <ribasushi@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/SQL-Abstract"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=9756eb4cd606e68606e3f7de3567eed8"

DEPENDS = "perl-module-scalar-util \
           perl-module-list-util \
           perl-module-carp \
           libclass-accessor-grouped-perl \
           libgetopt-long-descriptive-perl \
           libhash-merge-perl \
           "

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RI/RIBASUSHI/SQL-Abstract-${PV}.tar.gz"
SRC_URI[md5sum] = "4eca363f44ab195e75f45f307c37660e"
SRC_URI[sha256sum] = "55466f4a2dd9f919037d32e5a97b01084168e359b51fde85045215ea0405e7f2"

S = "${WORKDIR}/SQL-Abstract-${PV}"

do_configure_prepend() {
	sed -i '/^requires .*/d' Makefile.PL
	sed -i '/^test_requires .*/d' Makefile.PL
}

inherit cpan

RDEPENDS_${PN} += "perl-module-scalar-util \
                   perl-module-list-util \
                   perl-module-carp \
                   libclass-accessor-grouped-perl \
                   libgetopt-long-descriptive-perl \
                   libhash-merge-perl \
                   "

RPROVIDES_${PN} += "libsql-abstract-test-perl \
                    libsql-abstract-tree-perl \
                    "

BBCLASSEXTEND = "native"
