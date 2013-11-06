SUMMARY = "constant - Perl pragma to declare constants"
AUTHOR = "Sébastien Aperghis-Tramoni <saper@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/constant"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=e159cc1a0bf68494e422b174640580ae"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SA/SAPER/constant-${PV}.tar.gz"
SRC_URI[md5sum] = "1e00a4fbed2b98ae1f447848b132cdd0"
SRC_URI[sha256sum] = "744453124b07800d6fd6b901061892cbbcc134a316adbe0f1edfc5f89e04312b"

S = "${WORKDIR}/constant-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
