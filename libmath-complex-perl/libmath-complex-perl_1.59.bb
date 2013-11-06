SUMMARY = "Modules for complex numbers and trigonometric functions"
AUTHOR = "Andrew Main (Zefram) <zefram@fysh.org>"
HOMEPAGE = "https://metacpan.org/release/Math-Complex"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=88c1f0fb9bec2feb1feb8bedc33b9eb3"

DEPENDS = "libextutils-makemaker-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Math-Complex-${PV}.tar.gz"
SRC_URI[md5sum] = "94f9d6b557b56408949928a55227c86f"
SRC_URI[sha256sum] = "f35eb4987512c51d2c47294a008ede210d8dd759b90b887d04847c69b42dd6d1"

S = "${WORKDIR}/Math-Complex-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-exporter \
                   perl-module-scalar-util \
                   "

RPROVIDES_${PN} += "libmath-trig-perl"

BBCLASSEXTEND = "native"
