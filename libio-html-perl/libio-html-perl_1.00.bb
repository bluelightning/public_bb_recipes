SUMMARY = "IO::HTML - Open an HTML file with automatic charset detection"
AUTHOR = "Christopher J. Madsen <perl@cjmweb.net>"
HOMEPAGE = "https://metacpan.org/module/IO::HTML"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9800f1e83371d6303d5782364b863be"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CJ/CJM/IO-HTML-1.00.tar.gz"
SRC_URI[md5sum] = "fdfa3fe3d61a7fda9236c8d9776cdd65"
SRC_URI[sha256sum] = "04e29fd5f2535e35a9d478f2775471d79e2da6a3cf2bd33befb2dcd7811ad21a"

S = "${WORKDIR}/IO-HTML-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-exporter"

BBCLASSEXTEND = "native"
