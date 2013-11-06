SUMMARY = "Class::Data::Inheritable - Inheritable, overridable class data"
AUTHOR = "Tony Bowden <tony@tmtm.com>g"
HOMEPAGE = "https://metacpan.org/module/Class::Data::Inheritable"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=b95ef7af267842936c377b47edb9fb1d"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TM/TMTM/Class-Data-Inheritable-${PV}.tar.gz"
SRC_URI[md5sum] = "fc0fe65926eb8fb932743559feb54eb9"
SRC_URI[sha256sum] = "9967feceea15227e442ec818723163eb6d73b8947e31f16ab806f6e2391af14a"

S = "${WORKDIR}/Class-Data-Inheritable-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
