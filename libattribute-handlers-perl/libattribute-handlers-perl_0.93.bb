SUMMARY = "Attribute::Handlers - Simpler definition of attribute handlers"
AUTHOR = "Steffen Müller <smueller@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Attribute::Handlers"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=3c1b86c36af6017808844c12b29c737f"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/Attribute-Handlers-0.93.tar.gz"
SRC_URI[md5sum] = "5658992d2bc52ee5a5547425c1bec074"
SRC_URI[sha256sum] = "1d2a1ae00f54bc65c4aefda58ac52ea1b0fb9346ac4c612f5dd40192be7df04c"

S = "${WORKDIR}/Attribute-Handlers-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

