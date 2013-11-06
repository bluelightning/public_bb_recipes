SUMMARY = "Taint::Util - Test for and flip the taint flag without regex matches or eval"
AUTHOR = "Ævar Arnfjörð Bjarmason <avar@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Taint::Util"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=163e3dcf7202c72ffabbc1d4d69e6e9c"

RDEPENDS_${PN} += 'libtest-more-perl libxsloader-perl'

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AV/AVAR/Taint-Util-${PV}.tar.gz"
SRC_URI[md5sum] = "4f081a8a6e82352741c0486784cbc23d"
SRC_URI[sha256sum] = "78047c65237ee4ca2451bd8b44936db09a34a3925003eccf4255bcd7fdd9768c"

S = "${WORKDIR}/Taint-Util-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
