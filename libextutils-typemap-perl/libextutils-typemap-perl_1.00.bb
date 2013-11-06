SUMMARY = "ExtUtils::Typemap - Read/Write/Modify Perl/XS typemap files"
AUTHOR = "Steffen Müller <smueller@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/ExtUtils::Typemap"
SECTION = "libs"
LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://README;md5=73fdf8ddd515cffc529d46040bcdcffb"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-Typemap-1.00.tar.gz"
SRC_URI[md5sum] = "a7175a06e27939a83b1b781e91c13ad0"
SRC_URI[sha256sum] = "b1b015772dbb068b93a0f6ffa02f5d94822365e6018ac5ed2bc53ca669071fc7"

S = "${WORKDIR}/ExtUtils-Typemap-${PV}"

inherit cpan

BBCLASSEXTEND = "native"