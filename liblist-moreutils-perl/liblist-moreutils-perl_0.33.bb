SUMMARY = "List::MoreUtils - Provide the stuff missing in List::Util"
AUTHOR = "Adam Kennedy <adamk@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/List::MoreUtils"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=385c55653886acac3821999a3ccd17b3"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/List-MoreUtils-0.33.tar.gz"
SRC_URI[md5sum] = "8a33c84028cc2ff3e92c92434b326c0f"
SRC_URI[sha256sum] = "315c0b444c22b7bf207ac3c7e651d102c84a2308bfafb7a7efe095a9219494ad"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan

BBCLASSEXTEND = "native"