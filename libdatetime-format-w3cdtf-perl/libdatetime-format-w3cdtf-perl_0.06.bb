SUMMARY = "DateTime::Format::W3CDTF - Parse and format W3CDTF datetime strings"
AUTHOR = "Gregory Todd Williams <gwilliams@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/DateTime::Format::W3CDTF"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a89fc6431f978476bd49e3f7a26a1a1e"

RDEPENDS_${PN} = "libdatetime-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GW/GWILLIAMS/DateTime-Format-W3CDTF-0.06.tar.gz"
SRC_URI[md5sum] = "7eb2a90b78e7e2232eddbd6dd6758a23"
SRC_URI[sha256sum] = "b9a542bed9c52b0a89dd590a5184e38ee334c824bbe6bac842dd7dd1f88fbd7a"

S = "${WORKDIR}/DateTime-Format-W3CDTF-${PV}"

inherit cpan
BBCLASSEXTEND = "native"
