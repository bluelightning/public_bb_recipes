SUMMARY = "GetOpt::Long, but simpler and more powerful"
AUTHOR = "Ricardo Signes <rjbs@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Getopt-Long-Descriptive"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92a1a730df69594487278b28f0bd9d01"

RDEPENDS_${PN} = "perl-module-carp \
                  perl-module-file-basename \
                  perl-module-getopt-long \
                  perl-module-list-util \
                  perl-module-overload \
                  perl-module-scalar-util \
                  perl-module-strict \
                  perl-module-warnings \
                  libparams-validate-perl \
                  libsub-exporter-perl \
                  libsub-exporter-util-perl \                  
                  "

RPROVIDES_${PN} = "libgetopt-long-descriptive-perl \
                   libgetopt-long-descriptive-opts-perl \
                   libgetopt-long-descriptive-usage-perl \
                  "

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Getopt-Long-Descriptive-${PV}.tar.gz"
SRC_URI[md5sum] = "78708f771a8a5e43824591758e2f5325"
SRC_URI[sha256sum] = "706a6c9da95c7fb6d38ed90377f30f4c7824c58f051cbfe34a1085608282a689"

S = "${WORKDIR}/Getopt-Long-Descriptive-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
