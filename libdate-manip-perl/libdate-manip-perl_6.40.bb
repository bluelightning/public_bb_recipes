SUMMARY = "Date::Manip::Date - Methods for working with dates"
AUTHOR = "Sullivan Beck <sbeck@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/SBECK/Date-Manip-6.40/lib/Date/Manip/Date.pod"
SECTION = "libs"
LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e762ba8e86f30b85a5b3977d248519f2"

DEPENDS = "perl-module-extutils-makemaker"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SB/SBECK/Date-Manip-${PV}.tar.gz"
SRC_URI[md5sum] = "ae57b05e8ec689de2f23c99639e0109d"
SRC_URI[sha256sum] = "a18d0beab9cfb2d99978daa93897686502fee9a2108f26f6229969110197c07a"

S = "${WORKDIR}/Date-Manip-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module carp \
                   perl-module-encode \
                   perl-module-io-file \
                   perl-module-storable \
                   perl-module-file-basename \
                   libtest-inter-perl \
                   libtest-more-perl \
                   "

RPROVIDES_${PN} += "libdate-manip-perl \
                    libdate-manip-base-perl \
                    libdate-manip-date-perl \
                    libdate-manip-delta-perl \
                    libdate-manip-dm5-perl \
                    libdate-manip-dm6-perl \
                    libdate-manip-lang-catalan-perl \
                    libdate-manip-lang-danish-perl \
                    libdate-manip-lang-dutch-perl \
                    libdate-manip-lang-english-perl \
                    libdate-manip-lang-finnish-perl \
                    libdate-manip-lang-french-perl \
                    libdate-manip-lang-german-perl \
                    libdate-manip-lang-italian-perl \
                    libdate-manip-lang-norwegian-perl \
                    libdate-manip-lang-polish-perl \
                    libdate-manip-lang-portugue-perl \
                    libdate-manip-lang-romanian-perl \
                    libdate-manip-lang-russian-perl \
                    libdate-manip-lang-spanish-perl \
                    libdate-manip-lang-swedish-perl \
                    libdate-manip-lang-turkish-perl \
                    libdate-manip-obj-perl \
                    libdate-manip-recur-perl \
                    libdate-manip-tz-perl \
                    libdate-manip-tz-perl \
                    libdate-manip-tzdata-perl \
                    libdate-manip-zones-perl \
                    "

BBCLASSEXTEND = "native"
