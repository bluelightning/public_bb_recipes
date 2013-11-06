SUMMARY = "HTTP::Cookies - HTTP cookie jars"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/HTTP::Cookies"
SECTION = "libs"
LICENSE = "Artistic-1.0+ | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=d601f2e0bf56c067a5c4d70f20e3b118"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Cookies-${PV}.tar.gz"
SRC_URI[md5sum] = "ecfd0eeb88512033352c2f13c9580f03"
SRC_URI[sha256sum] = "f5d3ade383ce6389d80cb0d0356b643af80435bb036afd8edce335215ec5eb20"

RDEPENDS_${PN} += "libhttp-date-perl \
                   libhttp-headers-util-perl \
                   libtime-local-perl \
                   "

S = "${WORKDIR}/HTTP-Cookies-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
