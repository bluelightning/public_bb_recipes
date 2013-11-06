SUMMARY = "Contains Cwd, File::Spec and File::Spec::*"
AUTHOR = "Steffen Müller <smueller@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/PathTools"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=8f8e618aa6b8cb45d9e04bf2f282fdc0"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/PathTools-${PV}.tar.gz"
SRC_URI[md5sum] = "7da19c34dc2d1017cbb675a6ff4fe283"
SRC_URI[sha256sum] = "a629a9ce63e0505740e2d5f54799757679e8d458b4a475bc1c4ed35b2da14c44"

S = "${WORKDIR}/PathTools-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-carp \
                   perl-module-scalar-util \
                   libtest-perl \
                   "

RPROVIDES_${PN} += "libcwd-perl \
                    libfile-spec-perl \
                    libfile-spec-cygwin-perl \
                    libfile-spec-epoc-perl \
                    libfile-spec-functions-perl \
                    libfile-spec-mac-perl \
                    libfile-spec-os2-perl \
                    libfile-spec-unix-perl \
                    libfile-spec-vms-perl \
                    libfile-spec-win32 \
                    "

BBCLASSEXTEND = "native"
