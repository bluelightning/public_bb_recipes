SUMMARY = "XSLoader - Dynamically load C libraries into Perl code"
AUTHOR = "Sébastien Aperghis-Tramoni <saper@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/XSLoader"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=0fdcd1d3d02be45cbe822405f2dcaf90"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SA/SAPER/XSLoader-${PV}.tar.gz"
SRC_URI[md5sum] = "eadde97008deb281fd6f1d5d595fb2fa"
SRC_URI[sha256sum] = "96de61bad187919bf632cfa657f1b9957ad47defcc90dad8ee1f50c955eedb86"

S = "${WORKDIR}/XSLoader-${PV}"

inherit cpan

RDEPENDS_${PN} += "libtest-more-perl"

BBCLASSEXTEND = "native"
