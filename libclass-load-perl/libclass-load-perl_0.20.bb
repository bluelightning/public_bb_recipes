SUMMARY = 'Class::Load - a working (require "Class::Name") and more'
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/module/Class::Load"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d108ac5ca8319465973748e873c24653"

RDEPENDS_${PN} = "perl-module-strict \
                 perl-module-warnings \
                 perl-module-carp \
                 libdata-optlist-perl \
                 libmodule-runtime-perl \
                 perl-module-scalar-util \
                 libtry-tiny-perl \                 
                 "

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Class-Load-${PV}.tar.gz"
SRC_URI[md5sum] = "9ccb131338a6cf1318599c08c095cf72"
SRC_URI[sha256sum] = "823c45885e1d29feef6867282b881d402f42af6413c7e0e9f8fe32086aee8c20"

S = "${WORKDIR}/Class-Load-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
