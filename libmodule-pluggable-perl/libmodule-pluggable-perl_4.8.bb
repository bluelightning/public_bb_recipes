SUMMARY = "Automatically give your module the ability to have plugins"
AUTHOR = "Simon Wistow <simonw@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Module-Pluggable"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=97ed9759d17ebbcde30aa4cc3869fc96"

RDEPENDS_${PN} = " \
                 perl-module-file-basename \
                 perl-module-if \
                 libfile-spec-perl \
                 "
                 
SRC_URI = "http://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-${PV}.tar.gz"
SRC_URI[md5sum] = "28806a26002ef887db8430f14ba3f5cd"
SRC_URI[sha256sum] = "a2b59788de632d4dfea0346d9264a007d5c3742c6055db063d400cf5acd2823d"

S = "${WORKDIR}/Module-Pluggable-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
