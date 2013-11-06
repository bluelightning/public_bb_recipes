SUMMARY = "Exporter for custom-build routines"
AUTHOR = "Ricardo Signes <rjbs@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Sub-Exporter"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c728ac266d2a1c977c295a04175ca73"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/Sub-Exporter-${PV}.tar.gz"
SRC_URI[md5sum] = "5332d269a7ba387773fcd140b72a0ed2"
SRC_URI[sha256sum] = "543cb2e803ab913d44272c7da6a70bb62c19e467f3b12aaac4c9523259b083d6"

S = "${WORKDIR}/Sub-Exporter-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-carp \
                   perl-module-strict \
                   perl-module-warnings \
                   libdata-optlist-perl \
                   libparams-util-perl \
                   libsub-install-perl \
                   "

RPROVIDES_${PN} += "libsub-exporter-util-perl"

BBCLASSEXTEND = "native"
