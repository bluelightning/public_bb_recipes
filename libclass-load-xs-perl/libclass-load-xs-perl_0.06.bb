SUMMARY = 'Class::Load - a working (require "Class::Name") and more'
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/module/Class::Load"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f33fe2893b9c422c5c7b0158bc87142"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Class-Load-XS-${PV}.tar.gz"

SRC_URI[md5sum] = "a3e73647f84eb8bd26847c3dda78f0d3"
SRC_URI[sha256sum] = "338232719c6646e4d411954feb30b3db5bb5b024a277fc644e5270676d1a87b6"

S = "${WORKDIR}/Class-Load-XS-${PV}"

inherit cpan_build

RDEPENDS_${PN} += "perl-module-strict \
                   perl-module-warnings \
                   libclass-load-perl \
                   libxsloader-perl \
                   "

BBCLASSEXTEND = "native"
